class DnDCharacter {

    private static final int DICE_THROWS = 4;
    private static final int DICE_SIDES = 6;

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int hitpoints;

    public DnDCharacter() {
        this.strength = ability();
        this.dexterity = ability();
        this.constitution = ability();
        this.intelligence = ability();
        this.wisdom = ability();
        this.charisma = ability();
        this.hitpoints = this.modifier(this.getConstitution()) + 10;
    }

    int ability() {
        int dice[] = new int[DICE_THROWS];
        int result = 0;
        for (int i = 0; i < DICE_THROWS; ++i) {
            dice[i] = (int)(Math.random() * DICE_SIDES) + 1;
        }
        int lowestDice = 0;
        for (int i = 0; i < dice.length; ++i) {
            if (dice[i] < dice[lowestDice]) {
                lowestDice = i;
            }
        }

        for (int i = 0; i < dice.length; ++i) {
            if (i != lowestDice) {
                result += dice[i];
            }
        }
        return result;
    }

    int modifier(int input) {
        int result = input - 10;
        result = Math.floorDiv(result, 2);
        return result;
    }

    public int getStrength() {
        return this.strength;
    }
    public int getDexterity() {
        return this.dexterity;
    }
    public int getConstitution() {
        return this.constitution;
    }
    public int getIntelligence() {
        return this.intelligence;
    }
    public int getWisdom() {
        return this.wisdom;
    }
    public int getCharisma() {
        return this.charisma;
    }
    public int getHitpoints() {
        return this.hitpoints;
    }
}