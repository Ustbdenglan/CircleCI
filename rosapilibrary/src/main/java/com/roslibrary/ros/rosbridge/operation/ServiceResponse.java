/**
 * Copyright (c) 2014 Jilk Systems, Inc.
 * <p>
 * This file is part of the Java ROSBridge Client.
 * <p>
 * The Java ROSBridge Client is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * The Java ROSBridge Client is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with the Java ROSBridge Client.  If not, see http://www.gnu.org/licenses/.
 */
package com.roslibrary.ros.rosbridge.operation;

import com.roslibrary.ros.message.Message;
import com.roslibrary.ros.message.MessageType;
import com.roslibrary.ros.rosbridge.indication.Indicated;
import com.roslibrary.ros.rosbridge.indication.Indicator;

@MessageType(string = "service_response")
public class ServiceResponse extends Operation {
    @Indicator
    public String service;
    public boolean result;
    @Indicated
    public Message values;

    public ServiceResponse() {
    }

    public ServiceResponse(String service) {
        this.service = service;
    }
}
