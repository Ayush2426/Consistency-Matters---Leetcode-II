public class DefangingAnIpAdress {
    public String FormingIpAdress(String s){
        StringBuilder sb = new StringBuilder();
        char arrAdd[] = s.toCharArray();
        for(char ch : arrAdd){
            if(ch == '.'){
                sb.append("[.]");
            }else{
                sb.append(ch);
            }
        }
        // STreaksss
        return sb.toString();
    }
    public static void main(String[] args) {
        DefangingAnIpAdress dAdress = new DefangingAnIpAdress();
        dAdress.FormingIpAdress("122.322.333.2");
    }
}
