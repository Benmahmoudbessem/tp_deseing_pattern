class StarDecorator extends MarioDecorator {
    public StarDecorator(MarioComponent mario) {
        super(mario);
    }

    @Override
    public void performAction() {
        super.performAction();
        System.out.println("Mario est invincible !");
    }
}