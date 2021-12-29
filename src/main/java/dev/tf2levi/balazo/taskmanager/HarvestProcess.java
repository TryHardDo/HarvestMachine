package dev.tf2levi.balazo.taskmanager;

import dev.tf2levi.balazo.Balazoka;
import dev.tf2levi.balazo.Harvester;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

public class HarvestProcess extends BukkitRunnable {
    private final Harvester harvester;

    public HarvestProcess(final Harvester harvester) {
        this.harvester = harvester;
    }

    @Override
    public void run() {
        // A hosszú folyamat... Ide jön majd hogy mit tegyen a kombájn minden tickre amit kiad a scheduler.

        //Todo: Ezt majd írogatni!!!

        // MINDENKÉPP FRISSÍTENI KELL A CACHET MERT AKKOR NAGY BUGOK LESZNEK
        Balazoka.getHarvesters().replace(harvester.getId(), harvester);
    }

    public BukkitTask startProcess() {
        return this.runTaskTimer(Balazoka.getInstance(), 0, (20 * 10) / harvester.getSpeedMultiplier());
    }
}
