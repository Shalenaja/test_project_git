public class program {
    private static StringBuilder append;
    
    public static void main(String[] args) {
        String strInput = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String str = strInput.replace("{", "").replace("}", "").replace("\"", "");
        StringBuilder strBuild = new StringBuilder();    
        String [] newStr = str.split(",");
                                                
        for (String ell : newStr) {
            if (ell.contains("null")) {                         
                continue;}
            else {
                String [] newStrRes = ell.split(":");
                for (int i = 0; i < newStrRes.length; i++);{
                    append = strBuild.append(newStrRes[0]).append(" = ")
                    .append(newStrRes[1]).append(" and ");}
            }
        }
        System.out.println("select * from students where name = " + strBuild.substring(0, strBuild.length() - 4));
    }
}