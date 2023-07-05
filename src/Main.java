public class Main {
    public static void main(String[] args) {
        String x = "Davut Cagri";
        String y = "Cagri";
        String z = "cagri";
        String i = "Akbıyık";
        char [] helloList = {'h', 'e', 'l', 'l', 'o'};
        String empty = "";

        //1. charAt
        System.out.println("x.charAt(2): " + x.charAt(2));

        //2. codePointAt
        System.out.println("x.codePointAt(2): " + x.codePointAt(2));

        //3. codePointBefore
        System.out.println("x.codePointBefore(2): " + x.codePointBefore(2));

        //4. codePointCount
        System.out.println("x.codePointCount(2, 6): " + x.codePointCount(2, 6));

        //5. compareTo
        System.out.println("x.compareTo(y): " + x.compareTo(y));

        //6. compareToIgnoreCase
        System.out.println("x.compareToIgnoreCase(z): " + x.compareToIgnoreCase(z));

        //7. concat
        System.out.println("x.concat(i): " + x.concat(i));

        //8. contains
        System.out.println("x.contains('z'): " + x.contains("z"));

        //9. contentEquals
        System.out.println("x.contentEquals('Davut Cagri'): " + x.contentEquals("Davut Cagri"));

        //10. copyValueOf
        System.out.println("empty.copyValueOf(helloList, 0, 5): " + empty.copyValueOf(helloList, 0, 5));

        //11. endsWith
        System.out.println("x.endsWith('i'): " + x.endsWith("i"));

        //12. startsWith
        System.out.println("x.startsWith('D'): " + x.startsWith("D"));

        //13. equals
        System.out.println("x.equals('Davut Cagri'): " + x.equals("Davut Cagri"));

        //14. equalsIgnoreCase
        System.out.println("x.equalsIgnoreCase('dAvUt cAgri'): " + x.equalsIgnoreCase("dAvUt cAgri"));

        //15. getBytes
        System.out.println("x.getBytes(): " + x.getBytes());

        //16. hashCode
        System.out.println("x.hashCode(): " + x.hashCode());

        //17. indexOf
        System.out.println("x.indexOf('Cagri'): " + x.indexOf("Cagri"));

        //18. isEmpty
        System.out.println("empty.isEmpty(): " + empty.isEmpty());

        //19. lastIndexOf
        System.out.println("x.lastIndexOf('Davut'): " + x.lastIndexOf("Davut"));

        //20. length
        System.out.println("x.length(): " + x.length());

        //21. matches
        System.out.println("x.matches(y): " + x.matches(y));

        //22. replace
        System.out.println("z.replace('a', 'l'): " + z.replace('a', 'l'));

        //23. subString
        System.out.println("x.substring(2): " + x.substring(2));

        //24. toLowerCase
        System.out.println("x.toLowerCase(): " + x.toLowerCase());

        //25. toUpperCase
        System.out.println("x.toUpperCase(): " + x.toUpperCase());
    }
}