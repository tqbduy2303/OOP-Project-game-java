package utilz;

import Main.Game;

public class Constants {
	public static class Directions {
		public static final int LEFT = 0;
		public static final int UP = 1;
		public static final int RIGHT = 2;
		public static final int DOWN = 3;
	}
	public static class UI {
		public static class Buttons {
			public static final int B_WIDTH_DEFAULT = 140;
			public static final int B_HEIGHT_DEFAULT = 56;
			public static final int B_WIDTH = (int) (B_WIDTH_DEFAULT * Game.SCALE);
			public static final int B_HEIGHT = (int) (B_HEIGHT_DEFAULT * Game.SCALE);
		}
	}
	public static class EnemyConstants {
		public static final int FIRE_DUDE = 0;
		public static final int IDLE = 0;

		public static final int FIRE_DUDE_WIDTH_DEFAULT = 32;
		public static final int FIRE_DUDE_HEIGHT_DEFAULT = 15;
		public static final int FIRE_DUDE_WIDTH = (int) (FIRE_DUDE_WIDTH_DEFAULT * Game.SCALE);
		public static final int FIRE_DUDE_HEIGHT = (int) (FIRE_DUDE_HEIGHT_DEFAULT * Game.SCALE);

		public static final int FIRE_DUDE_DRAWOFFSET_X = (int)(26*Game.SCALE);
		public static final int FIRE_DUDE_DRAWOFFSET_Y = (int)(9*Game.SCALE);
		public static int GetSpriteAmount(int enemy_type, int enemy_state) {
			switch (enemy_state) {
				case FIRE_DUDE:
					switch (enemy_state) {
						case IDLE:
							return 8;
					}
			}
			return 0;

		}
	}

		public static class PlayerConstants {
			public static final int IDLE = 3;
			public static final int RUNNING = 0;
			public static final int RUNNING2 = 5;

			public static final int ATTACK_2 = 4;
			public static final int HIT = 1;
			public static final int ATTACK_1 = 2;

			public static int GetSpriteAmount(int player_action) {
				switch (player_action) {
					case IDLE:
						return 4;
					case HIT:
						return 5;
					case RUNNING:					
					case RUNNING2:
					case ATTACK_2:
					case ATTACK_1:
						return 6;

					default:
						return 1;
				}
			}
		}

}