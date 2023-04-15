package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties(ignoreUnknown = true)

import java.util.Map;

public class AbilitiesPokemonPojo  {

    private AbilityPojo ability;

    private boolean is_hidden;

    private int slot;

    public AbilityPojo getAbility() {
        return ability;
    }

    public void setAbility(AbilityPojo ability) {
        this.ability = ability;
    }

    public boolean isIs_hidden() {
        return is_hidden;
    }

    public void setIs_hidden(boolean is_hidden) {
        this.is_hidden = is_hidden;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }
}
