package agent.job;

/**
 * Metadata class for the 'agent.job' package/folder.
 * Used by MenuGridProxy to define the folder's appearance in the UI.
 */
public class job {
    
    /**
     * Returns the display name of the folder.
     */
    public static String name() {
        return "Standard Jobs";
    }

    /**
     * Returns the tooltip description for the folder.
     */
    public static String info() {
        return "Contains standard automation jobs for everyday tasks.";
    }

    /**
     * Returns the resource path for the folder icon.
     */
    public static String icon() {
        return "assets/icon.png";
    }

    /**
     * Returns the sort key to determine the folder's position.
     * Folders with lower sort keys appear first.
     */
    public static String sortkey() {
        return "\ufffe\ufffe01_job";
    }
}
