package characters;

import java.util.ArrayList;
import java.util.List;

import characters.Characters.CharacterType;
import javafx.scene.image.Image;

public class IronMan  extends Characters {
	private static List<Image> imageArray = new ArrayList<Image>();
	static {
		for(int i=0; i<5; i++) 	
			imageArray.add(new Image("ironMan" + i + ".png", true));
	}
	
	public IronMan(boolean canSail){
		super(CharacterType.HERO, 95, imageArray, canSail);
	}
}
