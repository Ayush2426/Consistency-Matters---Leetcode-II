public class SwappingWithoutThirdVariable {
    public void SwapKarnaHai(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a: "+a+", b: "+b);
    }
    public static void main(String[] args) {
        SwappingWithoutThirdVariable swtv = new SwappingWithoutThirdVariable();
        swtv.SwapKarnaHai(10, 20);
    }
}
