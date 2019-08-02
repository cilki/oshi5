// This file was automatically generated by the OSHI API generator; do not edit!
package oshi.api;

import java.util.stream.Stream;
import oshi.api.hardware.disk.DiskLinux;
import oshi.api.hardware.firmware.FirmwareLinux;
import oshi.api.hardware.nic.NicLinux;

public interface LinuxSystem {
  Stream<NicLinux> getNicStream();

  Stream<DiskLinux> getDiskStream();

  FirmwareLinux getFirmware();
}