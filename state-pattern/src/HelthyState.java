public class HelthyState implements  PlayerState {
@Override
public void action(Player p) {
    p.attack();
    p.fireBomb();
    p.fireGunblade();
    p.fireLaserPistol();
}}
