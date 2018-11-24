package cn.itcast.day11.demo06;

public class DemoMain {
    public static void main(String[] args) {
        // 创建一个英雄角色
        Hero hero = new Hero();
        hero.setName("概论");
        hero.setAge(20);

        // 创建一个武器对象
        Weapon weapon = new Weapon("AK-47");
        hero.setWeapon(weapon);

        hero.attack();
    }
}
