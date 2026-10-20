interface ModernGame {
    void playDigital();
}

class ModernConsole {
    public void play(ModernGame game) {
        game.playDigital();
    }
}

class RetroCartridge {
    public void insertCartridge() {
        System.out.println("Retro Game is running from cartridge!");
    }
}

class CartridgeAdapter implements ModernGame {
    private RetroCartridge retroCartridge;

    public CartridgeAdapter(RetroCartridge retroCartridge) {
        this.retroCartridge = retroCartridge;
    }

    @Override
    public void playDigital() {
        retroCartridge.insertCartridge(); 
    }
}

public class Main {
    public static void main(String[] args) {
        ModernConsole console = new ModernConsole();
        RetroCartridge retroGame = new RetroCartridge();

        ModernGame adapter = new CartridgeAdapter(retroGame);

        console.play(adapter);
    }
}