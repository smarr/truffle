/*
 * Copyright (c) 2018, 2021, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package org.graalvm.compiler.hotspot.amd64;

import org.graalvm.compiler.api.replacements.Snippet;
import org.graalvm.compiler.hotspot.HotSpotForeignCallLinkage;
import org.graalvm.compiler.hotspot.meta.HotSpotProviders;
import org.graalvm.compiler.hotspot.stubs.SnippetStub;
import org.graalvm.compiler.options.OptionValues;
import org.graalvm.compiler.replacements.amd64.AMD64ArrayIndexOfNode;

import jdk.vm.ci.meta.JavaKind;

public class AMD64ArrayIndexOfStub extends SnippetStub {

    public AMD64ArrayIndexOfStub(OptionValues options, HotSpotProviders providers, HotSpotForeignCallLinkage linkage) {
        super(linkage.getDescriptor().getName(), options, providers, linkage);
    }

    @Snippet
    private static int indexOfTwoConsecutiveBytes(byte[] array, int arrayLength, int fromIndex, int searchValue) {
        return AMD64ArrayIndexOfNode.optimizedArrayIndexOf(JavaKind.Byte, JavaKind.Byte, true, array, arrayLength, fromIndex, searchValue);
    }

    @Snippet
    private static int indexOfTwoConsecutiveChars(char[] array, int arrayLength, int fromIndex, int searchValue) {
        return AMD64ArrayIndexOfNode.optimizedArrayIndexOf(JavaKind.Byte, JavaKind.Char, true, array, arrayLength, fromIndex, searchValue);
    }

    @Snippet
    private static int indexOfTwoConsecutiveCharsCompact(byte[] array, int arrayLength, int fromIndex, int searchValue) {
        return AMD64ArrayIndexOfNode.optimizedArrayIndexOf(JavaKind.Char, JavaKind.Char, true, array, arrayLength, fromIndex, searchValue);
    }

    @Snippet
    private static int indexOf1Byte(byte[] array, int arrayLength, int fromIndex, byte v1) {
        return AMD64ArrayIndexOfNode.optimizedArrayIndexOf(JavaKind.Byte, JavaKind.Byte, false, array, arrayLength, fromIndex, v1);
    }

    @Snippet
    private static int indexOf2Bytes(byte[] array, int arrayLength, int fromIndex, byte v1, byte v2) {
        return AMD64ArrayIndexOfNode.optimizedArrayIndexOf(JavaKind.Byte, JavaKind.Byte, false, array, arrayLength, fromIndex, v1, v2);
    }

    @Snippet
    private static int indexOf3Bytes(byte[] array, int arrayLength, int fromIndex, byte v1, byte v2, byte v3) {
        return AMD64ArrayIndexOfNode.optimizedArrayIndexOf(JavaKind.Byte, JavaKind.Byte, false, array, arrayLength, fromIndex, v1, v2, v3);
    }

    @Snippet
    private static int indexOf4Bytes(byte[] array, int arrayLength, int fromIndex, byte v1, byte v2, byte v3, byte v4) {
        return AMD64ArrayIndexOfNode.optimizedArrayIndexOf(JavaKind.Byte, JavaKind.Byte, false, array, arrayLength, fromIndex, v1, v2, v3, v4);
    }

    @Snippet
    private static int indexOf1Char(char[] array, int arrayLength, int fromIndex, char v1) {
        return AMD64ArrayIndexOfNode.optimizedArrayIndexOf(JavaKind.Char, JavaKind.Char, false, array, arrayLength, fromIndex, v1);
    }

    @Snippet
    private static int indexOf2Chars(char[] array, int arrayLength, int fromIndex, char v1, char v2) {
        return AMD64ArrayIndexOfNode.optimizedArrayIndexOf(JavaKind.Char, JavaKind.Char, false, array, arrayLength, fromIndex, v1, v2);
    }

    @Snippet
    private static int indexOf3Chars(char[] array, int arrayLength, int fromIndex, char v1, char v2, char v3) {
        return AMD64ArrayIndexOfNode.optimizedArrayIndexOf(JavaKind.Char, JavaKind.Char, false, array, arrayLength, fromIndex, v1, v2, v3);
    }

    @Snippet
    private static int indexOf4Chars(char[] array, int arrayLength, int fromIndex, char v1, char v2, char v3, char v4) {
        return AMD64ArrayIndexOfNode.optimizedArrayIndexOf(JavaKind.Char, JavaKind.Char, false, array, arrayLength, fromIndex, v1, v2, v3, v4);
    }

    @Snippet
    private static int indexOf1CharCompact(byte[] array, int arrayLength, int fromIndex, char v1) {
        return AMD64ArrayIndexOfNode.optimizedArrayIndexOf(JavaKind.Byte, JavaKind.Char, false, array, arrayLength, fromIndex, v1);
    }

    @Snippet
    private static int indexOf2CharsCompact(byte[] array, int arrayLength, int fromIndex, char v1, char v2) {
        return AMD64ArrayIndexOfNode.optimizedArrayIndexOf(JavaKind.Byte, JavaKind.Char, false, array, arrayLength, fromIndex, v1, v2);
    }

    @Snippet
    private static int indexOf3CharsCompact(byte[] array, int arrayLength, int fromIndex, char v1, char v2, char v3) {
        return AMD64ArrayIndexOfNode.optimizedArrayIndexOf(JavaKind.Byte, JavaKind.Char, false, array, arrayLength, fromIndex, v1, v2, v3);
    }

    @Snippet
    private static int indexOf4CharsCompact(byte[] array, int arrayLength, int fromIndex, char v1, char v2, char v3, char v4) {
        return AMD64ArrayIndexOfNode.optimizedArrayIndexOf(JavaKind.Byte, JavaKind.Char, false, array, arrayLength, fromIndex, v1, v2, v3, v4);
    }
}
