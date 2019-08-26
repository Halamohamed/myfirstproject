public class MainClass {
    public static void Main(String[]args){
        String str1="hala";
        String str2="halaali";
        String namn;
        System.out.println(MainClass.getBiggestString(str1,str2));
        System.out.println("");

    }
    public static String getBiggestString(String str1, String str2){
        if(str1.length()>str2.length()){
            return str1;
        }
        else
        {
            return  str2;
        }
    }

}
