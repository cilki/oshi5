/**
 * OSHI (https://github.com/oshi/oshi)
 *
 * Copyright (c) 2010 - 2019 The OSHI Project Team:
 * https://github.com/oshi/oshi/graphs/contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package oshi.driver;

import java.util.Objects;
import java.util.stream.Stream;

import oshi.api.MultiSystem;
import oshi.api.hardware.disk.Disk;
import oshi.api.hardware.firmware.Firmware;
import oshi.api.hardware.nic.Nic;

@SuppressWarnings("unchecked")
public class SystemDriver implements MultiSystem {

	private Object driver;

	public SystemDriver(Object driver) {
		this.driver = Objects.requireNonNull(driver);
	}

	@Override
	public Stream<Nic> getNicStream() {
		try {
			return (Stream<Nic>) driver.getClass().getMethod("getNicStream").invoke(driver);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public Stream<Disk> getDiskStream() {
		try {
			return (Stream<Disk>) driver.getClass().getMethod("getDiskStream").invoke(driver);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public Firmware getFirmware() {
		try {
			return (Firmware) driver.getClass().getMethod("getFirmware").invoke(driver);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}