package bank;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public interface FileUtiles {

    public static Path getLocalPath(String... more) {
        return Paths.get(System.getProperty("user.dir"),
                //daca nu avem o cls enum             //daca avem o cls enum
                //     /*"bankResources" */         ResourcesDirectories.BankResources.name(),
                more);
    }




}
