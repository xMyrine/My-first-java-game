package cz.cvut.fel.pjv.objects;

/**
 * Interface for all interactable objects in the game.
 * 
 * @Author Minh Tu Pham
 */
public interface InteractableObject {

    /**
     * Change state of object
     * This method is called when player interacts with object and fulfills the
     * conditions for interaction or when the object is in the player's range
     * 
     * @param check
     */
    public void changeState(boolean check);

}
