/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

/**
 * @author Joe
 */
public interface Range {
    void selectRangeWeapon();
    void RangeWeaponAtk();
    int getAmmoCount();
    void setAmmoCount(int ammoCount);
    void decreaseAmmoCount();
    void increaseAmmoCount(int plusAmmoCount);
}
