public class Main {
    public static void main(String[] args) {

        String toBoolean = "true";   /* -> boolean */
        String toByte = "120";    /* -> byte    */
        String toShort = "32000";  /* -> short   */
        String tolLong = "987654321987654321";   /* -> long */
        String tolDouble = "4444.5d";       /* doble */
        String toFloat = "2354.56f";     /*float*/


        boolean valbool = Boolean.parseBoolean(toBoolean);
        System.out.println(valbool);

        byte valbyte = Byte.parseByte(toByte);
        System.out.println(valbyte);

        short valshort = Short.parseShort(toShort);
        System.out.println(valshort);

        long vallong = Long.parseLong(tolLong);
        System.out.println(vallong);

        double valdouble = Double.parseDouble(tolDouble);
        System.out.println(valdouble);

        float valfloat = Float.parseFloat(toFloat);
        System.out.println(valfloat);
    }
}