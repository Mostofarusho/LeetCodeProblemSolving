public class CatChatGPT extends AnimalChatGPT{
    
    void Sound(){
        System.out.println("Mao Mao");
    }
    public static void main(String[] args) {
        CatChatGPT obj=new CatChatGPT();
        obj.Sound();
    }
}
