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
package org.robovm.apple.spritekit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("SpriteKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKVideoNode/*</name>*/ 
    extends /*<extends>*/SKNode/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SKVideoNodePtr extends Ptr<SKVideoNode, SKVideoNodePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKVideoNode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SKVideoNode() {}
    protected SKVideoNode(SkipInit skipInit) { super(skipInit); }
    public SKVideoNode(AVPlayer player) { super((SkipInit) null); initObject(init(player)); }
    public SKVideoNode(String videoFile) { super((SkipInit) null); initObject(init(videoFile)); }
    public SKVideoNode(NSURL url) { super((SkipInit) null); initObject(init(url)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "size")
    public native @ByVal CGSize getSize();
    @Property(selector = "setSize:")
    public native void setSize(@ByVal CGSize v);
    @Property(selector = "anchorPoint")
    public native @ByVal CGPoint getAnchorPoint();
    @Property(selector = "setAnchorPoint:")
    public native void setAnchorPoint(@ByVal CGPoint v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAVPlayer:")
    protected native @Pointer long init(AVPlayer player);
    @Method(selector = "initWithVideoFileNamed:")
    protected native @Pointer long init(String videoFile);
    @Method(selector = "initWithVideoURL:")
    protected native @Pointer long init(NSURL url);
    @Method(selector = "play")
    public native void play();
    @Method(selector = "pause")
    public native void pause();
    @Method(selector = "videoNodeWithAVPlayer:")
    public static native SKVideoNode create(AVPlayer player);
    @Method(selector = "videoNodeWithVideoFileNamed:")
    public static native SKVideoNode create(String videoFile);
    @Method(selector = "videoNodeWithVideoURL:")
    public static native SKVideoNode create(NSURL videoURL);
    /*</methods>*/
}
