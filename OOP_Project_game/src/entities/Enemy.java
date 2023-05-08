package entities;


import utilz.Constants;

public abstract class Enemy extends Entity{
    private int aniIndex, enemyState, enemyType;
    private int aniTick, aniSpeed = 25;
    public Enemy(float x, float y, int width, int height, int enemyType) {
        super(x, y, width, height);
        this.enemyType = enemyType;

    }

    private void updateAnimationTick(){
        aniTick ++;
        if (aniTick >= aniSpeed){
            aniTick = 0;
            aniIndex++;
            if (aniIndex >= Constants.EnemyConstants.GetSpriteAmount(enemyType,enemyState)){
                aniIndex = 0;
            }
        }
    }
    public void update(){
        updateAnimationTick();
    }
    public int getAniIndex(){
        return aniIndex;
    }
    public int getEnemyState(){
        return enemyState;
    }
}