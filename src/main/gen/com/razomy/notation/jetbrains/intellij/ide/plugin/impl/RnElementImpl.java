package com.razomy.notation.jetbrains.intellij.ide.plugin.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.razomy.notation.jetbrains.intellij.ide.plugin.RnElement;
import org.jetbrains.annotations.NotNull;

public abstract class RnElementImpl extends ASTWrapperPsiElement implements RnElement {

    public RnElementImpl(@NotNull ASTNode node) {
        super(node);
    }

}