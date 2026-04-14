package lmi;

// import haven
import haven.*;

// import constant
import static lmi.Constant.*;
import static lmi.Constant.Message.*;
import static lmi.Constant.Action.*;
import static lmi.Constant.Input.Mouse.*;
import static lmi.Constant.Input.Modifier.*;
import static lmi.Constant.InteractionType.*;
import static lmi.Constant.MeshId.*;

/**
 * 위젯 상호작용을 통한 메시지 전송을 담당하는 클래스입니다.
 * 서버로 전송되는 메시지(Server-bound)와 클라이언트 내부에서 처리되는 메시지(Client-internal)를 구분하여 정의합니다.
 */
class WidgetMessageHandler {

  // --- MapView Interactions ---

  /**
   * [서버 전송] 맵 위의 특정 좌표를 클릭합니다. (이동 등)
   * @param coord 클릭할 맵 좌표
   * @param mouseButton 마우스 버튼 (1: 좌클릭, 3: 우클릭)
   * @param modifier 키보드 수정자 (Shift, Ctrl 등)
   */
  static void click(Coord coord, int mouseButton, int modifier) {
    WidgetMessageHandler.sendClickMessage(
        AppContext.mapView,
        Coord.z,
        coord,
        mouseButton,
        modifier);
  }

  /**
   * [서버 전송] 현재 캐릭터 위치를 우클릭하여 현재 행동을 취소합니다.
   */
  static void cancelAction() {
    WidgetMessageHandler.click(Self.position(), IM_RIGHT, IM_NONE);
  }

  /**
   * [서버 전송] 특정 Gob(오브젝트)을 클릭합니다.
   * @param gob 대상 오브젝트
   * @param mouseButton 마우스 버튼
   * @param modifier 키보드 수정자
   * @param meshId 특정 메쉬 ID (보통 MI_NONE)
   */
  static void click(Gob gob, int mouseButton, int modifier, int meshId) {
    final Coord gobLocation = gob.position();
    WidgetMessageHandler.sendClickMessage(
        AppContext.mapView,
        Coord.z,
        gobLocation,
        mouseButton,
        modifier,
        IT_DEFAULT,
        gob.id(),
        gobLocation,
        0,
        meshId);
  }

  /**
   * [서버 전송] 특정 Gob(오브젝트)을 클릭합니다. (기본 메쉬 사용)
   */
  static void click(Gob gob, int mouseButton, int modifier) {
    WidgetMessageHandler.click(gob, mouseButton, modifier, MI_NONE);
  }

  /**
   * [서버 전송] MapView에 클릭 메시지를 보냅니다.
   * @param widget MapView 위젯
   * @param clickedMapViewPoint 클릭된 뷰포트 좌표
   * @param clickedMapPoint 클릭된 실제 맵 좌표
   * @param mouseButton 마우스 버튼
   * @param modifiers 키보드 수정자
   */
  static void sendClickMessage(
      haven.MapView widget,
      Coord clickedMapViewPoint,
      Coord clickedMapPoint,
      int mouseButton,
      int modifiers) {
    widget.sendMessage(
        M_CLICK,
        clickedMapViewPoint,
        clickedMapPoint,
        mouseButton,
        modifiers);
  }

  /**
   * [서버 전송] MapView에 오브젝트 클릭 메시지를 보냅니다.
   * @param interactionType 상호작용 타입 (보통 IT_DEFAULT)
   * @param gobId 대상 오브젝트 ID
   * @param gobLocation 대상 오브젝트 위치
   * @param overlayId 오버레이 ID
   * @param meshId 메쉬 ID
   */
  static void sendClickMessage(
      haven.MapView widget,
      Coord clickedMapViewPoint,
      Coord clickedMapPoint,
      int mouseButton,
      int modifiers,
      int interactionType,
      int gobId,
      Coord gobLocation,
      int overlayId,
      int meshId) {
    widget.sendMessage(
        M_CLICK,
        clickedMapViewPoint,
        clickedMapPoint,
        mouseButton,
        modifiers,
        interactionType,
        gobId,
        gobLocation,
        overlayId,
        meshId);
  }

  /**
   * [서버 전송] 청사진(Blueprint)을 배치합니다.
   * @param coord 배치할 좌표
   * @param direction 방향
   * @param mouseButton 마우스 버튼
   * @param modifiers 키보드 수정자
   */
  static void sendPlaceMessage(
      Coord coord,
      int direction,
      int mouseButton,
      int modifiers) {
    AppContext.mapView.sendMessage(M_PLACE, coord, direction, mouseButton, modifiers);
  }

  /**
   * [서버 전송] 현재 배치 중인 청사진을 취소합니다.
   */
  static void sendCancelPlanMessage() {
    AppContext.mapView.sendMessage(M_PLACE, Self.position(), D_EAST, IM_RIGHT, IM_NONE);
  }

  // --- FlowerMenu Interactions ---

  /**
   * [서버 전송] 플라워 메뉴의 항목을 선택합니다.
   * @param widget 플라워 메뉴 위젯
   * @param index 선택할 항목 인덱스
   */
  static void sendChoosePetalMessage(haven.FlowerMenu widget, int index) {
    widget.sendMessage(M_CL, index, 0);
  }

  /**
   * [서버 전송] 플라워 메뉴를 닫습니다.
   * @param widget 플라워 메뉴 위젯
   */
  static void sendCloseFlowerMenuMessage(haven.FlowerMenu widget) {
    widget.sendMessage(M_CL, -1);
  }

  // --- Inventory & Item Interactions ---

  /**
   * [서버 전송] 아이템을 전송(Ctrl+클릭)합니다.
   * @param item 대상 아이템 위젯
   */
  static void sendTransferItemMessage(haven.GItem item) {
    item.sendMessage(M_TRANSFER, Coord.ZERO, IM_LEFT);
  }

  /**
   * [서버 전송] 인벤토리 간 아이템을 전송합니다.
   * @param inv 소스 인벤토리
   * @param targetId 대상 위젯 ID
   * @param amount 수량
   */
  static void sendInvxfMessage(haven.Inventory inv, int targetId, int amount) {
    inv.sendMessage("invxf", targetId, amount);
  }

  /**
   * [서버 전송] 인벤토리에서 아이템을 맵으로 버립니다.
   * @param inv 인벤토리 위젯
   * @param dc 버릴 위치 좌표
   */
  static void sendDropItemMessage(haven.Inventory inv, Coord dc) {
    inv.sendMessage(M_DROP, dc);
  }

  // --- ISBox (Stockpile) Interactions ---

  /**
   * [서버 전송] 스톡파일(ISBox)을 클릭합니다.
   * @param widget ISBox 위젯
   */
  static void sendClickISBoxMessage(haven.ISBox widget) {
    widget.sendMessage(M_CLICK);
  }

  /**
   * [서버 전송] 스톡파일에서 아이템을 하나 꺼냅니다. (Shift+클릭)
   * @param widget ISBox 위젯
   */
  static void sendTransferISBoxMessage(haven.ISBox widget) {
    widget.sendMessage(M_XFER);
  }

  /**
   * [서버 전송] 스톡파일에 대량으로 아이템을 넣거나 뺍니다. (마우스 휠)
   * @param widget ISBox 위젯
   * @param amount 수량 (음수: 빼기, 양수: 넣기)
   * @param mod 키보드 수정자
   */
  static void sendXfer2ISBoxMessage(haven.ISBox widget, int amount, int mod) {
    widget.sendMessage("xfer2", amount, mod);
  }

  /**
   * [서버 전송] 스톡파일에 아이템을 버립니다.
   * @param widget ISBox 위젯
   */
  static void sendDropISBoxMessage(haven.ISBox widget) {
    widget.sendMessage(M_DROP);
  }

  /**
   * [서버 전송] 스톡파일과 아이템 상호작용을 합니다. (우클릭)
   * @param widget ISBox 위젯
   */
  static void sendIactISBoxMessage(haven.ISBox widget) {
    widget.sendMessage("iact");
  }

  // --- Common Widget Interactions ---

  /**
   * [서버 전송] 버튼을 활성화(클릭)합니다.
   * @param button 대상 버튼 위젯
   */
  static void sendButtonBuildMessage(Button button) {
    button.sendMessage(M_ACTIVATE);
  }

  /**
   * [서버 전송] 창을 닫습니다.
   * @param window 대상 창 위젯
   */
  static void sendCloseWindowMessage(haven.Window window) {
    window.sendMessage("close");
  }

  /**
   * [클라이언트 내부] 위젯에 포커스를 줍니다.
   * @param widget 대상 위젯
   * @param focus 포커스 여부
   */
  static void sendFocusMessage(Widget widget, boolean focus) {
    widget.sendMessage(M_FOCUS, focus);
  }

  // --- ChatUI Interactions ---

  /**
   * [서버 전송] 채팅 메시지를 보냅니다.
   * @param chat 채팅 UI 위젯
   * @param text 보낼 메시지 내용
   */
  static void sendChatMessage(haven.ChatUI chat, String text) {
    chat.sendMessage("msg", text);
  }

  // --- Login & Character Selection ---

  /**
   * [서버 전송] 캐릭터를 선택하여 게임을 시작합니다.
   * @param widget 캐릭터 리스트 위젯
   * @param name 캐릭터 이름
   */
  static void selectCharacter(haven.Charlist widget, String name) {
    WidgetMessageHandler.sendSelectCharacterMessage(widget, name);
  }

  static void sendSelectCharacterMessage(haven.Charlist widget, String name) {
    widget.sendMessage(M_PLAY, name);
  }
}
