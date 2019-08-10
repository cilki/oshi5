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
// This file was automatically generated by the OSHI API generator; do not edit!
package oshi.api.hardware.nic;

import javax.annotation.processing.Generated;
import oshi.api.AttributeKey;
import oshi.api.hardware.nic.internal.NicAttributeEnum;

@Generated("oshi.ApiGenerator")
public class NicAttribute {
    /**
     * The interface's name
     */
    public static final AttributeKey<String> NAME = new AttributeKey<>(NicAttributeEnum.NAME);

    /**
     * The interface's description
     */
    public static final AttributeKey<String> DESCRIPTION = new AttributeKey<>(NicAttributeEnum.DESCRIPTION);

    /**
     * The maximum transmission unit
     */
    public static final AttributeKey<Integer> MTU = new AttributeKey<>(NicAttributeEnum.MTU);

    public static final AttributeKey<String> MAC = new AttributeKey<>(NicAttributeEnum.MAC);

    public static final AttributeKey<Boolean> VIRTUAL = new AttributeKey<>(NicAttributeEnum.VIRTUAL);

    /**
     * The interface's IPv4 addresses
     */
    public static final AttributeKey<String[]> IPV4 = new AttributeKey<>(NicAttributeEnum.IPV4);

    /**
     * The interface's IPv6 addresses
     */
    public static final AttributeKey<String[]> IPV6 = new AttributeKey<>(NicAttributeEnum.IPV6);

    public static final AttributeKey<String> BROADCAST = new AttributeKey<>(NicAttributeEnum.BROADCAST);

    /**
     * The interface's subnet mask
     */
    public static final AttributeKey<String> NETMASK = new AttributeKey<>(NicAttributeEnum.NETMASK);

    /**
     * The number of bytes read from the interface
     */
    public static final AttributeKey<Long> READ_BYTES = new AttributeKey<>(NicAttributeEnum.READ_BYTES);

    /**
     * The number of bytes written to the interface
     */
    public static final AttributeKey<Long> WRITE_BYTES = new AttributeKey<>(NicAttributeEnum.WRITE_BYTES);

    /**
     * The number of packets read from the interface
     */
    public static final AttributeKey<Long> READ_PACKETS = new AttributeKey<>(NicAttributeEnum.READ_PACKETS);

    /**
     * The number of packets written to the interface
     */
    public static final AttributeKey<Long> WRITE_PACKETS = new AttributeKey<>(NicAttributeEnum.WRITE_PACKETS);

    /**
     * The number of read errors
     */
    public static final AttributeKey<Long> READ_ERRORS = new AttributeKey<>(NicAttributeEnum.READ_ERRORS);

    /**
     * The number of write errors
     */
    public static final AttributeKey<Long> WRITE_ERRORS = new AttributeKey<>(NicAttributeEnum.WRITE_ERRORS);

    /**
     * The number of read drops
     */
    public static final AttributeKey<Long> READ_DROPS = new AttributeKey<>(NicAttributeEnum.READ_DROPS);

    /**
     * The number of write drops
     */
    public static final AttributeKey<Long> WRITE_DROPS = new AttributeKey<>(NicAttributeEnum.WRITE_DROPS);

    /**
     * The number of write collisions
     */
    public static final AttributeKey<Long> WRITE_COLLISIONS = new AttributeKey<>(NicAttributeEnum.WRITE_COLLISIONS);

    /**
     * The interface's maximum speed in bytes
     */
    public static final AttributeKey<Long> LINK_SPEED = new AttributeKey<>(NicAttributeEnum.LINK_SPEED);

    public static final AttributeKey<Boolean> DEFAULT_GATEWAY = new AttributeKey<>(NicAttributeEnum.DEFAULT_GATEWAY);

    public static final AttributeKey<Boolean> FLAG_UP = new AttributeKey<>(NicAttributeEnum.FLAG_UP);

    public static final AttributeKey<Boolean> FLAG_RUNNING = new AttributeKey<>(NicAttributeEnum.FLAG_RUNNING);

    public static final AttributeKey<Boolean> FLAG_LOOPBACK = new AttributeKey<>(NicAttributeEnum.FLAG_LOOPBACK);

    public static final AttributeKey<Boolean> FLAG_MULTICAST = new AttributeKey<>(NicAttributeEnum.FLAG_MULTICAST);

    /**
     * The interface's locally unique identifier
     */
    public static final AttributeKey<Long> LUID = new AttributeKey<>(NicAttributeEnum.LUID);

    /**
     * The interface's globally unique identifier
     */
    public static final AttributeKey<String> GUID = new AttributeKey<>(NicAttributeEnum.GUID);

    /**
     * Whether the interface is in a paused state
     */
    public static final AttributeKey<Boolean> PAUSED = new AttributeKey<>(NicAttributeEnum.PAUSED);

    /**
     * Whether the interface is in a low-power state
     */
    public static final AttributeKey<Boolean> LOWPOWER = new AttributeKey<>(NicAttributeEnum.LOWPOWER);
}