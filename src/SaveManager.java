import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SaveManager {
    public SaveManager() {

    }

    public static void writeSaveData() {

    }

    public static void readSaveData(int saveSlot) throws IOException {
        //get user directory (eg C:/Users/username/ or /home/username/) and append game save folder and save file based on slot
        Path saveFilePath = Paths.get(System.getProperty("user.home") + "Sunskimmer82/StrategyGame/GameSave_" + saveSlot + ".dat");

        //check if save file exists. if it doesn't, recursively create directories and create the save file
        if (!Files.exists(saveFilePath)) {
            Path parentDir = saveFilePath.getParent();
            if (parentDir != null && !Files.exists(parentDir)) {
                Files.createDirectories(parentDir);
            }
            Files.createFile(saveFilePath);
        }
        
        //open save file and read serialized data
        byte[] saveBytes = Files.readAllBytes(saveFilePath);

        //TODO: parse save data into game data using defined binary structures

        //version size offset 0x0
        //version data offset 0x1
        


        
    }

    private String BytesToString(int offset, int length, Byte[] bytes) throws Exception {
        Byte[] tmpBytes = {};
        for (int i = 0;i<length;i++) {
        }
        throw new Exception();
    }
    
}
