import java.nio.file.Path;
import java.nio.file.Paths;

public class StrategyGameManager {
    public StrategyGameManager() {
        
    }

    public void startGame() {
        System.out.println("Initializing save data");
        saveFilePath = Paths.get(System.getProperty("user.home") + "Sunskimmer82/StrategyGame/");

    }

    public void changeParty(int partySlot, Character newCharacter) {
        party[partySlot] = newCharacter;
    }

    public Path getGameDataPath() {
        return saveFilePath;
    }

    public String getVersion() {
        return version;
    }


    //system
    private Path saveFilePath;
    private String version = "0.1A";


    //game    
    private Character[] party = new Character[4];
    private String currentMap;
    
}
