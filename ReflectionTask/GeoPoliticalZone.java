package ReflectionTask;

public enum GeoPoliticalZone {

    NORTH_CENTRAL(new String[]{
            "benue", "fct", "kogi", "kwara",
            "nasarawa", "niger", "plateau"
    }),

    NORTH_EAST(new String[]{
            "adamawa", "bauchi", "borno",
            "gombe", "taraba", "yobe"
    }),

    NORTH_WEST(new String[]{
            "kaduna", "katsina", "kano",
            "kebbi", "sokoto", "jigawa", "zamfara"
    }),

    SOUTH_EAST(new String[]{
            "abia", "anambra", "ebonyi",
            "enugu", "imo"
    }),

    SOUTH_SOUTH(new String[]{
            "akwa ibom", "bayelsa", "cross river",
            "delta", "edo", "rivers"
    }),

    SOUTH_WEST(new String[]{
            "ekiti", "lagos", "osun",
            "ondo", "ogun", "oyo"
    });

    private String[] states;

    GeoPoliticalZone(String[] states) {
        this.states = states;
    }

    public String[] getStates() {
        return states;
    }

    public static GeoPoliticalZone findZone(String state) {

        for (GeoPoliticalZone zone : GeoPoliticalZone.values()) {

            for (String currentState : zone.getStates()) {

                if (currentState.equalsIgnoreCase(state)) {
                    return zone;
                }
            }
        }
        return null;
    }
}