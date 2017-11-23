package com.customproperty.util;

import java.beans.PropertyEditor;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

import com.customproperty.beans.Dimension;
import com.customproperty.beans.DimensionPropertyEditor;

public class CustomPropertyEditorRegistar implements PropertyEditorRegistrar {

	@Override
	public void registerCustomEditors(PropertyEditorRegistry rigistry) {
		rigistry.registerCustomEditor(Dimension.class, new DimensionPropertyEditor());		
	}

}
