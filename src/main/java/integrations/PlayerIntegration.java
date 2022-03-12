package integrations;

import org.bukkit.entity.Player;

import java.util.Date;
import java.util.UUID;

public class PlayerIntegration {
    // Start of Class \\

    Player player;

    UUID playerUUID;

    String typeScope;
    String requestUUID;

    Date integrationStart = new Date();

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public UUID getPlayerUUID() {
        return playerUUID;
    }

    public void setPlayerUUID(UUID playerUUID) {
        this.playerUUID = playerUUID;
    }

    public String getTypeScope() {
        return typeScope;
    }

    public void setTypeScope(String typeScope) {
        this.typeScope = typeScope;
    }

    public String getRequestUUID() {
        return requestUUID;
    }

    public void setRequestUUID(String requestUUID) {
        this.requestUUID = requestUUID;
    }

    public Date getIntegrationStart() {
        return integrationStart;
    }

    // End of Class \\

}
