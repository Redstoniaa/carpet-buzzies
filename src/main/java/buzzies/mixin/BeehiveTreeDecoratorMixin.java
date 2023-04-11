package buzzies.mixin;

import net.minecraft.world.gen.treedecorator.BeehiveTreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import buzzies.custom.BeenestAlwaysDecorator;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BeehiveTreeDecorator.class)
public abstract class BeehiveTreeDecoratorMixin
{
    @Shadow @Final
    private float probability;

    @Inject(method = "generate", at = @At("HEAD"), cancellable = true)
    private void onGenerate(TreeDecorator.Generator generator, CallbackInfo ci)
    {
        if (probability < 1.0f)
        {
            BeenestAlwaysDecorator.generate(generator);
            ci.cancel();
        }
    }
}