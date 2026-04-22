package lmi;

import java.io.InputStream;

public class Scanner {
  // fields
  private static java.util.Scanner _scanner;

  // public methods
  public static String nextLine() {
    return _scanner.nextLine();
  }

  public static String nextLineWithPrompt(String prompt) {
    System.out.print(prompt + " % ");
    return _scanner.nextLine();
  }

  // package methods
  static void init(InputStream inputStream) {
    _scanner = new java.util.Scanner(inputStream);
  }

  // getObjectByInputFromProperty()
  static Object getObjectByInputFromField(Object object, Class classObject) throws Exception {
    printPublicFieldList(classObject);
    String fieldName = lmi.Scanner.nextLineWithPrompt("enter field name");
    object = Util.getFieldValueFromObjectByNameAsClass(object, fieldName, classObject);

    return object;
  }

  static Object getObjectByInputFromMethod(Object object, Class classObject) throws Exception {
    printPublicMethodList(classObject);
    String methodName = lmi.Scanner.nextLineWithPrompt("enter method name");
    object = Util.getMethodValueFromObjectByNameAsClass(object, methodName, classObject);

    return object;
  }
}
