package integrations;

import java.util.UUID;

public class UUIDManager {
    public final UUID sessionUUID = UUID.randomUUID();
    public final String namespacedKey = "skyblock:";
    public final String namespacedRequest = "request:";

    public String generateNamespacedSkyblockUUID(){
        UUID generatedUUID = UUID.randomUUID();

        return this.namespacedKey + generatedUUID;
    }

    public String generateNamespacedRequestUUID(){
        UUID generatedUUID = UUID.randomUUID();

        return this.namespacedRequest + generatedUUID;
    }
}
