/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache license, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the license for the specific language governing permissions and
 * limitations under the license.
 */
package org.apache.logging.log4j;

import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.message.ObjectMessage;
import org.apache.logging.log4j.message.ParameterizedMessage;
import org.apache.logging.log4j.message.SimpleMessage;
import org.apache.logging.log4j.spi.AbstractLogger;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 */
public class AbstractLoggerTest extends AbstractLogger {

    private static Level currentLevel;

    private LogEvent currentEvent;

    private static Throwable t = new UnsupportedOperationException("Test");

    private static Class<AbstractLogger> obj = AbstractLogger.class;

    private static String pattern = "{}, {}";
    private static String p1 = "Long Beach";
    private static String p2 = "California";

    private static Message simple = new SimpleMessage("Hello");
    private static Message object = new ObjectMessage(obj);
    private static Message param = new ParameterizedMessage(pattern, p1, p2);

    private static String marker = "TEST";

    private static LogEvent[] events = new LogEvent[] {
        new LogEvent(null, simple, null),
        new LogEvent(marker, simple, null),
        new LogEvent(null, simple, t),
        new LogEvent(marker, simple, t),

        new LogEvent(null, object, null),
        new LogEvent(marker, object, null),
        new LogEvent(null, object, t),
        new LogEvent(marker, object, t),

        new LogEvent(null, param, null),
        new LogEvent(marker, param, null),

        new LogEvent(null, simple, null),
        new LogEvent(null, simple, t),
        new LogEvent(marker, simple, null),
        new LogEvent(marker, simple, t),
        new LogEvent(marker, simple, null),

    };

    @Test
    public void testTrace() {
        currentLevel = Level.TRACE;

        currentEvent = events[0];
        trace("Hello");
        trace(null, "Hello");
        currentEvent = events[1];
        trace(MarkerManager.getMarker("TEST"), "Hello");
        currentEvent = events[2];
        trace("Hello", t);
        trace(null, "Hello", t);
        currentEvent = events[3];
        trace(MarkerManager.getMarker("TEST"), "Hello", t);
        currentEvent = events[4];
        trace(obj);
        currentEvent = events[5];
        trace(MarkerManager.getMarker("TEST"), obj);
        currentEvent = events[6];
        trace(obj, t);
        trace(null, obj, t);
        currentEvent = events[7];
        trace(MarkerManager.getMarker("TEST"), obj, t);
        currentEvent = events[8];
        trace(pattern, p1, p2);
        currentEvent = events[9];
        trace(MarkerManager.getMarker("TEST"), pattern, p1, p2);
        currentEvent = events[10];
        trace(simple);
        trace(null, simple);
        trace(null, simple, null);
        currentEvent = events[11];
        trace(simple, t);
        trace(null, simple, t);
        currentEvent = events[12];
        trace(MarkerManager.getMarker("TEST"), simple, null);
        currentEvent = events[13];
        trace(MarkerManager.getMarker("TEST"), simple, t);
        currentEvent = events[14];
        trace(MarkerManager.getMarker("TEST"), simple);
    }

    @Test
    public void testDebug() {
        currentLevel = Level.DEBUG;

        currentEvent = events[0];
        debug("Hello");
        debug(null, "Hello");
        currentEvent = events[1];
        debug(MarkerManager.getMarker("TEST"), "Hello");
        currentEvent = events[2];
        debug("Hello", t);
        debug(null, "Hello", t);
        currentEvent = events[3];
        debug(MarkerManager.getMarker("TEST"), "Hello", t);
        currentEvent = events[4];
        debug(obj);
        currentEvent = events[5];
        debug(MarkerManager.getMarker("TEST"), obj);
        currentEvent = events[6];
        debug(obj, t);
        debug(null, obj, t);
        currentEvent = events[7];
        debug(MarkerManager.getMarker("TEST"), obj, t);
        currentEvent = events[8];
        debug(pattern, p1, p2);
        currentEvent = events[9];
        debug(MarkerManager.getMarker("TEST"), pattern, p1, p2);
        currentEvent = events[10];
        debug(simple);
        debug(null, simple);
        debug(null, simple, null);
        currentEvent = events[11];
        debug(simple, t);
        debug(null, simple, t);
        currentEvent = events[12];
        debug(MarkerManager.getMarker("TEST"), simple, null);
        currentEvent = events[13];
        debug(MarkerManager.getMarker("TEST"), simple, t);
        currentEvent = events[14];
        debug(MarkerManager.getMarker("TEST"), simple);
    }

    @Test
    public void testInfo() {
        currentLevel = Level.INFO;

        currentEvent = events[0];
        info("Hello");
        info(null, "Hello");
        currentEvent = events[1];
        info(MarkerManager.getMarker("TEST"), "Hello");
        currentEvent = events[2];
        info("Hello", t);
        info(null, "Hello", t);
        currentEvent = events[3];
        info(MarkerManager.getMarker("TEST"), "Hello", t);
        currentEvent = events[4];
        info(obj);
        currentEvent = events[5];
        info(MarkerManager.getMarker("TEST"), obj);
        currentEvent = events[6];
        info(obj, t);
        info(null, obj, t);
        currentEvent = events[7];
        info(MarkerManager.getMarker("TEST"), obj, t);
        currentEvent = events[8];
        info(pattern, p1, p2);
        currentEvent = events[9];
        info(MarkerManager.getMarker("TEST"), pattern, p1, p2);
        currentEvent = events[10];
        info(simple);
        info(null, simple);
        info(null, simple, null);
        currentEvent = events[11];
        info(simple, t);
        info(null, simple, t);
        currentEvent = events[12];
        info(MarkerManager.getMarker("TEST"), simple, null);
        currentEvent = events[13];
        info(MarkerManager.getMarker("TEST"), simple, t);
        currentEvent = events[14];
        info(MarkerManager.getMarker("TEST"), simple);
    }

    @Test
    public void testWarn() {
        currentLevel = Level.WARN;

        currentEvent = events[0];
        warn("Hello");
        warn(null, "Hello");
        currentEvent = events[1];
        warn(MarkerManager.getMarker("TEST"), "Hello");
        currentEvent = events[2];
        warn("Hello", t);
        warn(null, "Hello", t);
        currentEvent = events[3];
        warn(MarkerManager.getMarker("TEST"), "Hello", t);
        currentEvent = events[4];
        warn(obj);
        currentEvent = events[5];
        warn(MarkerManager.getMarker("TEST"), obj);
        currentEvent = events[6];
        warn(obj, t);
        warn(null, obj, t);
        currentEvent = events[7];
        warn(MarkerManager.getMarker("TEST"), obj, t);
        currentEvent = events[8];
        warn(pattern, p1, p2);
        currentEvent = events[9];
        warn(MarkerManager.getMarker("TEST"), pattern, p1, p2);
        currentEvent = events[10];
        warn(simple);
        warn(null, simple);
        warn(null, simple, null);
        currentEvent = events[11];
        warn(simple, t);
        warn(null, simple, t);
        currentEvent = events[12];
        warn(MarkerManager.getMarker("TEST"), simple, null);
        currentEvent = events[13];
        warn(MarkerManager.getMarker("TEST"), simple, t);
        currentEvent = events[14];
        warn(MarkerManager.getMarker("TEST"), simple);
    }

    @Test
    public void testError() {
        currentLevel = Level.ERROR;

        currentEvent = events[0];
        error("Hello");
        error(null, "Hello");
        currentEvent = events[1];
        error(MarkerManager.getMarker("TEST"), "Hello");
        currentEvent = events[2];
        error("Hello", t);
        error(null, "Hello", t);
        currentEvent = events[3];
        error(MarkerManager.getMarker("TEST"), "Hello", t);
        currentEvent = events[4];
        error(obj);
        currentEvent = events[5];
        error(MarkerManager.getMarker("TEST"), obj);
        currentEvent = events[6];
        error(obj, t);
        error(null, obj, t);
        currentEvent = events[7];
        error(MarkerManager.getMarker("TEST"), obj, t);
        currentEvent = events[8];
        error(pattern, p1, p2);
        currentEvent = events[9];
        error(MarkerManager.getMarker("TEST"), pattern, p1, p2);
        currentEvent = events[10];
        error(simple);
        error(null, simple);
        error(null, simple, null);
        currentEvent = events[11];
        error(simple, t);
        error(null, simple, t);
        currentEvent = events[12];
        error(MarkerManager.getMarker("TEST"), simple, null);
        currentEvent = events[13];
        error(MarkerManager.getMarker("TEST"), simple, t);
        currentEvent = events[14];
        error(MarkerManager.getMarker("TEST"), simple);
    }

    @Test
    public void testFatal() {
        currentLevel = Level.FATAL;

        currentEvent = events[0];
        fatal("Hello");
        fatal(null, "Hello");
        currentEvent = events[1];
        fatal(MarkerManager.getMarker("TEST"), "Hello");
        currentEvent = events[2];
        fatal("Hello", t);
        fatal(null, "Hello", t);
        currentEvent = events[3];
        fatal(MarkerManager.getMarker("TEST"), "Hello", t);
        currentEvent = events[4];
        fatal(obj);
        currentEvent = events[5];
        fatal(MarkerManager.getMarker("TEST"), obj);
        currentEvent = events[6];
        fatal(obj, t);
        fatal(null, obj, t);
        currentEvent = events[7];
        fatal(MarkerManager.getMarker("TEST"), obj, t);
        currentEvent = events[8];
        fatal(pattern, p1, p2);
        currentEvent = events[9];
        fatal(MarkerManager.getMarker("TEST"), pattern, p1, p2);
        currentEvent = events[10];
        fatal(simple);
        fatal(null, simple);
        fatal(null, simple, null);
        currentEvent = events[11];
        fatal(simple, t);
        fatal(null, simple, t);
        currentEvent = events[12];
        fatal(MarkerManager.getMarker("TEST"), simple, null);
        currentEvent = events[13];
        fatal(MarkerManager.getMarker("TEST"), simple, t);
        currentEvent = events[14];
        fatal(MarkerManager.getMarker("TEST"), simple);
    }

    @Override
    protected void log(Marker marker, String fqcn, Level level, Message data, Throwable t) {
        assertTrue("Incorrect Level. Expected " + currentLevel + ", actual " + level, level.equals(currentLevel));
        if (marker == null) {
            if (currentEvent.markerName != null) {
                fail("Incorrect marker. Expected " + currentEvent.markerName + ", actual is null");
            }
        } else {
            if (currentEvent.markerName == null) {
                fail("Incorrect marker. Expected null. Actual is " + marker.getName());
            } else {
                assertTrue("Incorrect marker. Expected " + currentEvent.markerName + ", actual " +
                    marker.getName(), currentEvent.markerName.equals(marker.getName()));
            }
        }
        if (data == null) {
            if (currentEvent.data != null) {
                fail("Incorrect message. Expected " + currentEvent.data + ", actual is null");
            }
        } else {
            if (currentEvent.data == null) {
                fail("Incorrect message. Expected null. Actual is " + data.getFormattedMessage());
            } else {
                assertTrue("Incorrect message type. Expected " + currentEvent.data + ", actual " + data,
                    data.getClass().isAssignableFrom(currentEvent.data.getClass()));
                assertTrue("Incorrect message. Expected " + currentEvent.data.getFormattedMessage() + ", actual " +
                    data.getFormattedMessage(),
                    currentEvent.data.getFormattedMessage().equals(data.getFormattedMessage()));
            }
        }
        if (t == null) {
            if (currentEvent.t != null) {
                fail("Incorrect Throwable. Expected " + currentEvent.t + ", actual is null");
            }
        } else {
            if (currentEvent.t == null) {
                fail("Incorrect Throwable. Expected null. Actual is " + t);
            } else {
                assertTrue("Incorrect Throwable. Expected " + currentEvent.t + ", actual " + t,
                    currentEvent.t.equals(t));
            }
        }
    }

    @Override
    protected boolean isEnabled(Level level, Marker marker, String data) {
        return isEnabled(level, marker, new SimpleMessage(data), null);
    }

    @Override
    protected boolean isEnabled(Level level, Marker marker, String data, Throwable t) {
        return isEnabled(level, marker, new SimpleMessage(data), t);
    }

    @Override
    protected boolean isEnabled(Level level, Marker marker, String data, Object... p1) {
        return isEnabled(level, marker, new ParameterizedMessage(data, p1), null);
    }

    @Override
    protected boolean isEnabled(Level level, Marker marker, Object data, Throwable t) {
        return isEnabled(level, marker, new ObjectMessage(data), t);
    }

    @Override
    protected boolean isEnabled(Level level, Marker marker, Message data, Throwable t) {
        assertTrue("Incorrect Level. Expected " + currentLevel + ", actual " + level, level.equals(currentLevel));
        if (marker == null) {
            if (currentEvent.markerName != null) {
                fail("Incorrect marker. Expected " + currentEvent.markerName + ", actual is null");
            }
        } else {
            if (currentEvent.markerName == null) {
                fail("Incorrect marker. Expected null. Actual is " + marker.getName());
            } else {
                assertTrue("Incorrect marker. Expected " + currentEvent.markerName + ", actual " +
                    marker.getName(), currentEvent.markerName.equals(marker.getName()));
            }
        }
        if (data == null) {
            if (currentEvent.data != null) {
                fail("Incorrect message. Expected " + currentEvent.data + ", actual is null");
            }
        } else {
            if (currentEvent.data == null) {
                fail("Incorrect message. Expected null. Actual is " + data.getFormattedMessage());
            } else {
                assertTrue("Incorrect message type. Expected " + currentEvent.data + ", actual " + data,
                    data.getClass().isAssignableFrom(currentEvent.data.getClass()));
                assertTrue("Incorrect message. Expected " + currentEvent.data.getFormattedMessage() + ", actual " +
                    data.getFormattedMessage(),
                    currentEvent.data.getFormattedMessage().equals(data.getFormattedMessage()));
            }
        }
        if (t == null) {
            if (currentEvent.t != null) {
                fail("Incorrect Throwable. Expected " + currentEvent.t + ", actual is null");
            }
        } else {
            if (currentEvent.t == null) {
                fail("Incorrect Throwable. Expected null. Actual is " + t);
            } else {
                assertTrue("Incorrect Throwable. Expected " + currentEvent.t + ", actual " + t,
                    currentEvent.t.equals(t));
            }
        }
        return true;
    }


    private static class LogEvent {

        String markerName;
        Message data;
        Throwable t;

        public LogEvent(String markerName, Message data, Throwable t) {
            this.markerName = markerName;
            this.data = data;
            this.t = t;
        }
    }
}
