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
package org.robovm.apple.addressbook;

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
import org.robovm.apple.corefoundation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("AddressBook")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ABGroup/*</name>*/ 
    extends /*<extends>*/ABRecord/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(ABGroup.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    public String getName() {
        CFString val = (CFString)getValue(ABGroupProperty.Name);
        if (val != null) return val.toString();
        return null;
    }
    public void setName(String name) {
        setValue(ABGroupProperty.Name, new CFString(name));
    }
    
    public boolean addMember(ABPerson person) {
        return addMember(person, null);
    }
    
    public boolean removeMember(ABPerson member) {
        return removeMember(member, null);
    }
    /*<methods>*/
    @Bridge(symbol="ABGroupCreate", optional=true)
    public static native ABGroup create();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Bridge(symbol="ABGroupCreateInSource", optional=true)
    public static native ABGroup create(ABSource source);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Bridge(symbol="ABGroupCopySource", optional=true)
    public native ABSource getSource();
    @Bridge(symbol="ABGroupCopyArrayOfAllMembers", optional=true)
    public native NSArray<?> getAllMembers();
    @Bridge(symbol="ABGroupCopyArrayOfAllMembersWithSortOrdering", optional=true)
    public native NSArray<?> getAllMembers(ABPersonSortOrdering sortOrdering);
    @Bridge(symbol="ABGroupAddMember", optional=true)
    protected native boolean addMember(ABPerson person, NSError.NSErrorPtr error);
    @Bridge(symbol="ABGroupRemoveMember", optional=true)
    protected native boolean removeMember(ABPerson member, NSError.NSErrorPtr error);
    /*</methods>*/
}
