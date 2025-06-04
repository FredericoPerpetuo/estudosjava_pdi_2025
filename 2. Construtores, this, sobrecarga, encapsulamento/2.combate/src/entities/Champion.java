package entities;

public class Champion {
    private String name;
    private int life;
    private int attack;
    private int armor;

    public Champion(String name, int life, int attack, int armor){
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public void takeDamage(Champion other){
        if(this.armor >= other.getAttack()){
            this.life -= 1;
        }else{
            this.life -= other.getAttack() - this.armor;
        }

    }

    public int getAttack() {
        return attack;
    }

    public int getLife(){
        return life;
    }

    public String status(){
        if(life < 0){
            life = 0;
            return name + ": " + life + " de vida (morreu)";
        }else{
            return name + ": " + life + " de vida";
        }
    }


}
