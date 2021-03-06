package uet.oop.bomberman.entities.tile.item;

import uet.oop.bomberman.Game;
import uet.oop.bomberman.entities.Entity;
import uet.oop.bomberman.entities.character.Bomber;
import uet.oop.bomberman.graphics.Sprite;
import uet.oop.bomberman.level.Audio;

public class BombItem extends Item {

	public BombItem(int x, int y, Sprite sprite) {
		super(x, y, sprite);
	}

	@Override
	public boolean collide(Entity e) {
		// TODO: xu ly Bomber an Item
		if(e instanceof Bomber){
			((Bomber) e).addPowerup(this);
			remove();
			return true;
		}
		return false;
	}

	@Override
	public void setValues() {
		_active = true;
		Game.addBombRate(1);
		Audio.eat();
	}



}