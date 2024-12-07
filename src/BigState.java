class BigState implements MarioState {
    @Override
    public void jump() {
        System.out.println("Mario saute haut.");
    }

    @Override
    public void run() {
        System.out.println("Mario court plus vite.");
    }

    @Override
    public void takeDamage() {
        System.out.println("Mario redevient normal !");
    }
}
