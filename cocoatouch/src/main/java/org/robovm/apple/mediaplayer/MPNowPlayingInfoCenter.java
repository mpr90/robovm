/*
 * Copyright (C) 2014 Trillian Mobile AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.mediaplayer;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 5.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MediaPlayer") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPNowPlayingInfoCenter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPNowPlayingInfoCenterPtr extends Ptr<MPNowPlayingInfoCenter, MPNowPlayingInfoCenterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPNowPlayingInfoCenter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPNowPlayingInfoCenter() {}
    protected MPNowPlayingInfoCenter(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    public MPNowPlayingInfo getNowPlayingInfo() {
        return new MPNowPlayingInfo(getNowPlayingInfo0());
    }
    public void setNowPlayingInfo(MPNowPlayingInfo info) {
        setNowPlayingInfo0(info.getDictionary());
    }
    /*<properties>*/
    @Property(selector = "nowPlayingInfo")
    protected native NSDictionary<NSString, NSObject> getNowPlayingInfo0();
    @Property(selector = "setNowPlayingInfo:")
    protected native void setNowPlayingInfo0(NSDictionary<NSString, NSObject> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "defaultCenter")
    public static native MPNowPlayingInfoCenter getDefaultCenter();
    /*</methods>*/
}
