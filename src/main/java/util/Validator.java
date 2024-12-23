//package util;
//
//
//public class Validator {
//    public static void validateInputFormat(String value) {
//        if (!value.startsWith("[") || !value.endsWith("]")) {
//            throw new IllegalArgumentException("[ERROR] 올바르지 않은 형식으로 입력했습니다. 다시 입력해 주세요.");
//        }
//
//        if (!value.contains("-")) {
//            throw new IllegalArgumentException("[ERROR] 올바르지 않은 형식으로 입력했습니다. 다시 입력해 주세요.");
//        }
//    }
//
//    public static void isNumeric(String input) {
//        try {
//            Integer.parseInt(input);
//        } catch (NumberFormatException e) {
//            throw new NumberFormatException("[ERROR] 올바르지 않은 형식으로 입력했습니다. 다시 입력해 주세요.");
//        }
//    }
//
//    public static void isExistProduct(String name, Inventory inventory) {
//        if (!inventory.contains(name)) {
//            throw new IllegalArgumentException("[ERROR] 존재하지 않는 상품입니다. 다시 입력해 주세요.");
//        }
//    }
//
//    public static void isExceedQuantity(String name, String quantity, Inventory inventory) {
//        if (!inventory.isEnough(name, Integer.parseInt(quantity))) {
//            throw new IllegalArgumentException("[ERROR] 재고 수량을 초과하여 구매할 수 없습니다. 다시 입력해 주세요.");
//        }
//    }
//
//    public static void validateYesOrNo(String input) {
//        if (input == null || (!input.equalsIgnoreCase("Y") && !input.equalsIgnoreCase("N"))) {
//            throw new IllegalArgumentException("[ERROR] 올바르지 않은 형식으로 입력했습니다. 다시 입력해 주세요.");
//        }
//    }
//}
