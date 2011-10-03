/*
 * Copyright 2010 Daniel Kurka
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.googlecode.mgwt.ui.client.theme.base;

public interface DialogCss extends ButtonBaseCss {

	@ClassName("mgwt-DialogPanel")
	String getDialogPanel();

	@ClassName("mgwt-BottomPanel")
	String getBottomPanel();

	public String container();

	public String title();

	public String content();

	public String footer();

	public String okbutton();

	public String cancelbutton();

	public String active();

	@ClassName("mgwt-DialogAnimationContainer")
	String animationContainer();

	@ClassName("mgwt-DialogAnimationContainer-Shadow")
	String animationContainerShadow();

	String z_index();

	@ClassName("mgwt-DialogAnimationContainer-center")
	String animationContainerCenter();

}
