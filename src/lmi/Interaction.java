package lmi;

import haven.*;
import static lmi.Constant.Message.*;

public class Interaction {
  
  // --- MapView Interactions ---

  /**
   * [서버 전송] 맵 위의 특정 좌표를 클릭합니다. (이동 등)
   * @param coord 클릭할 맵 좌표
   * @param button 마우스 버튼 (1: left, 2: middle, 3: right)
   * @param modifier 키보드 수정자 (1: Shift, 2: Ctrl, 4: Alt)
   */
  public static void click(Coord coord, int button, int modifier) {
    Object[] args = { Coord.z, coord, button, modifier };
    AppContext.mapView().wdgmsg("click", args);
  }

  /**
   * [서버 전송] 특정 Gob(오브젝트)을 클릭합니다.
   * @param gob 대상 오브젝트
   * @param button 마우스 버튼 (1: left, 2: middle, 3: right)
   * @param modifier 키보드 수정자 (1: Shift, 2: Ctrl, 4: Alt)
   * @param isOverlay 오버레이인가 (0: false, 1: true)
   * @param olid 오버레이 id
   * @param meshId 특정 메쉬 ID (보통 MI_NONE)
   */
  public static void click(Gob gob, int button, int modifier, int isOverlay, int olid, int meshId) {
    Coord position = gob.position();
    Object[] args = {
      Coord.z, position, button, modifier, isOverlay, gob.id(), position, olid, meshId };
    AppContext.mapView().wdgmsg("click", args);
  }

  /**
   * [서버 전송] 청사진(Blueprint)을 배치합니다.
   * @param coord 배치할 좌표
   * @param direction 방향
   * @param button 마우스 버튼 (1: left, 2: middle, 3: right)
   * @param modifier 키보드 수정자 (1: Shift, 2: Ctrl, 4: Alt)
   */
  public static void place(Coord coord, int direction, int button, int modifier) {
    Object[] args = { coord, direction, button, modifier };
    AppContext.mapView().wdgmsg("place", args);
  }

  // --- Item Interactions (GItem) ---

  /**
   * [서버 전송] GItem 을 커서로 옮깁니다.
   * 커서에 이미 아이템이 존재하는 경우 안전 실패
   * @param item 아이템
   */
  public static void take(GItem item) {
    item.wdgmsg("take", Coord.z);
  }

  /**
   * [서버 전송] item과 동일한 타입 전부 옮기기.
   * container 및 stockpile
   * 멱등성
   * @param item 아이템
   * @param modifier 키보드 수정자 (-1: Shift+Cntrol 동일 타입, 1: Sift 하나)
   */
  public static void transfer(GItem item, int modifier) {
    item.wdgmsg("transfer", Coord.z, modifier);
  }

  /**
   * [서버 전송] 커서의 아이템을 인벤토리에 내려놓습니다.
   * 멱등성
   * @param inv 인벤토리 위젯
   * @param dc 버릴 위치 좌표
   */
  public static void drop(Inventory wdg, Coord coord) {
    wdg.wdgmsg("drop", coord);
  }

  // --- ISBox (Stockpile) Interactions ---

  /**
   * [서버 전송] 스톡파일에서 아이템 하나를 커서로 가져옵니다.
   * 멱등성
   * @param wdg ISBox 위젯
   */
  static void take(ISBox wdg) {
    wdg.wdgmsg("click");
  }

  /**
   * [서버 전송] 스톡파일에서 아이템을 하나 꺼냅니다. (Shift+클릭)
   * 멱등성
   * @param wdg 스톡파일 wdg
   */
  static void xfer(ISBox wdg) {
    wdg.wdgmsg("xfer");
  }

  /**
   * [서버 전송] 스톡파일에 스크롤로 아이템을 옮깁니다. (마우스 휠)
   * @param wdg 스톡파일 wdg
   * @param direction 스크롤 방향 (-1: 빼기, 1: 넣기)
   * @param modifier 키보드 수정자 (1: Shift 동작)
   */
  public static void scrollXfer(ISBox wdg, int direction, int modifier) {
    wdg.wdgmsg("xfer2", direction, modifier);
  }

  /**
   * [서버 전송] 스톡파일 위젯에 아이템을 넣습니다.
   * @param wdg ISBox 위젯
   */
  static void drop(haven.ISBox wdg) {
    wdg.wdgmsg("drop");
  }

  /**
   * [서버 전송] 스톡파일 Gob 에 아이템 상호작용
   * @param gob 대상 오브젝트
   * @param modifier 키보드 수정자
   * @param isOverlay 오버레이인가 (0: false, 1: true)
   * @param olid 오버레이 id
   * @param meshId 특정 메쉬 ID (보통 MI_NONE)
   */
  static void drop(Gob gob, int modifier, int isOverlay, int olid, int meshId) {
    Coord position = gob.position();
    AppContext.mapView().wdgmsg("itemact",
        Coord.z, position, modifier, isOverlay, gob.id(), position, olid, meshId);
  }

  /**
   * [서버 전송] 아이템 들고 아이템 우클릭
   * @param item 아이템
   * @param modifier 키보드 수정자
   */
  static void drop(GItem item, int modifier) {
    item.wdgmsg("itemact", modifier);
  }

  /**
   * [서버 전송] 아이템 우클릭
   * @param item 아이템
   * @param modifier 키보드 수정자
   */
  static void interact(GItem item, int modifier) {
    item.wdgmsg("iact", Coord.z, modifier);
  }

  /**
   * [서버 전송] 버튼을 활성화(클릭)합니다.
   * @param button 대상 버튼 위젯
   */
  static void activate(Button button) {
    button.wdgmsg("activate");
  }

  /**
   * [서버 전송] 창을 닫습니다.
   * @param window 대상 창 위젯
   */
  static void close(Window window) {
    window.wdgmsg("close");
  }

  /**
   * [클라이언트 내부] 위젯에 포커스를 줍니다.
   * @param widget 대상 위젯
   */
  static void focus(Widget widget) {
    widget.wdgmsg("wfocus", 1);
  }

  // --- Menu & wdg Interactions ---

//  /**
//   * [서버 전송] 채팅 메시지를 보냅니다.
//   * @param chat 채팅 UI 위젯
//   * @param text 보낼 메시지 내용
//   */
//  static void chat(haven.ChatUI chat, String text) {
//    chat.wdgmsg("msg", text);
//  }

  /**
   * [서버 전송] 플라워 메뉴의 항목을 선택합니다.
   * @param wdg 플라워 메뉴 위젯
   * @param index 선택할 항목 인덱스
   */
  public static void select(FlowerMenu menu, int index) {
    menu.wdgmsg("cl", index, 0);
  }

  /**
   * [서버 전송] 플라워 메뉴를 닫습니다.
   * @param wdg 플라워 메뉴 위젯
   */
  static void close(FlowerMenu wdg) {
    wdg.wdgmsg("cl", -1);
  }
}
