package tallestegg.guardvillagers.client;

import tallestegg.guardvillagers.client.models.MyArmorModel;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;

@EventBusSubscriber(
        modid = "tallestegg.guardvillagers",
        value = Dist.CLIENT)

public class ClientEvents {

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(
                ModModelLayers.MY_ARMOR,
                MyArmorModel::createLayer
        );
    }
}