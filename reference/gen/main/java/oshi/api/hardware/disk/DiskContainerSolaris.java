// This file was automatically generated by the OSHI API generator; do not edit!
package oshi.api.hardware.disk;

import oshi.driver.ComponentDriver;

/**
 * A storage device
 */
public class DiskContainerSolaris extends DiskContainer implements DiskSolaris {
  private transient ComponentDriver driver;

  public void attach(ComponentDriver driver) {
    this.driver = driver;
    super.attach(driver);
    // Query all constant attributes:
  }
}