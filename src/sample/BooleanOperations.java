package sample;

public class BooleanOperations {
    //1 value1 && value2 сон*юнкція
    public String conjunction(String value1, String value2){
        if (value1.equals("true") && value2.equals("null"))
            return "null";
        if (value2.equals("true") && value1.equals("null"))
            return "null";

        if(value1.equals("false") || value2.equals("false"))
            return "false";

        else if(value1.equals("true") && value2.equals("true"))
            return "true";

        return "null";
    }
    //2 value1 || value2 диз*юнкція
    public String disjunction(String value1, String value2){
        if (value1.equals("false") && value2.equals("null"))
            return "null";
        if (value2.equals("false") && value1.equals("null"))
            return "null";

        if (value1.equals("true") || value2.equals("true"))
            return "true";
        /*if (value2.equals("true"))
            return "true";*/

        if (value1.equals("false") && value2.equals("false"))
            return "false";

        return "null";
    }
    //3 value1 ~ value2 еквівалентрість
    public String equality(String value1, String value2){
        Boolean result = null;
        if (value1.equals("null") || value2.equals("null"))
            return "null";
        if (value1.equals("true") && value2.equals("true"))
            return "true";
        if (value1.equals("false") && value2.equals("false"))
            return "true";

        return "false";
    }
    //4 value1 !~ value2 симетрична різниця або додавання за модулем
    public String exclusiveOr(String value1, String value2){
        if (equality(value1, value2).equals("null"))
            return "null";
        if (equality(value1, value2).equals("true"))
            return "false";
        if (equality(value1, value2).equals("false"))
            return "true";

        return "";
    }
    //5 value1 !|| value2 стрілка Пірса
    public String notOr(String value1, String value2){
        if(disjunction(value1, value2).equals("null"))
            return "null";
        if(disjunction(value1, value2).equals("true"))
            return "false";
        if(disjunction(value1, value2).equals("false"))
            return "true";

        return "";
    }
    //6 value1 !&& value2 штриш Шаффера
    public String notAnd(String value1, String value2){
        Boolean result = null;
        if (conjunction(value1, value2).equals("null"))
            return "null";
        if (conjunction(value1, value2).equals("true"))
            return "false";
        if (conjunction(value1, value2).equals("false"))
            return "true";

        return "";
    }
    //7 value1 -> value2 імплікація
    public String implication(String value1, String value2){
        if (value1.equals("false"))
            return "true";
        if (value2.equals("true"))
            return "true";

        if (value1.equals("true") && value2.equals("false"))
            return "false";

        return "null";

    }
    //8 value2 -> value1 обернена імплікація
    public String converseImplication(String value1, String value2){

        return implication(value2, value1);
    }
    //9 !(value1 -> value2) заперечення імплікації
    public String notImplication(String value1, String value2) {
        Boolean result = null;
        if (implication(value1, value2).equals("null"))
            return "null";
        if (implication(value1, value2).equals("true"))
            return "false";
        if (implication(value1, value2).equals("false"))
            return "true";

        return "";
    }
    //10 !(value2 -> value1) заперечення оберненої імплікації
    public String notConverseImplication(String value1, String value2){
        if (converseImplication(value1, value2).equals("null"))
            return "null";
        if (converseImplication(value1, value2).equals("true"))
            return "false";
        if (converseImplication(value1, value2).equals("false"))
            return "true";

        return "";
    }
    //11 value1 повтор першого аргументу
    public String repeatTheFirstArgument(String value1, String value2){

        return value1;
    }
    //12 value2 повтор другого аргуме
    public String repeatTheSecondArgument(String value1, String value2){

        return value2;
    }
    //13 !value1 заперечення першого аргументу
    public String notTheFirstArgument(String value1, String value2){
        if (value1.equals("true"))
            return "false";
        if (value1.equals("false"))
            return "true";

        return "null";
    }
    //14 !value2 заперечення другого аргументу
    public String notTheSecondArgument(String value1, String value2){
        if (value2.equals("true"))
            return "false";
        if (value2.equals("false"))
            return "true";

        return "null";
    }
    //15 true
    public String constTrue(String value1, String value2){

        return "true";
    }
    //16 false
    public String constFalse(String value1, String value2){

        return "false";
    }
}