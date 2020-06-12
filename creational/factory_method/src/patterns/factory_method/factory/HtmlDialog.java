package patterns.factory_method.factory;

import patterns.factory_method.buttons.Button;
import patterns.factory_method.buttons.HtmlButton;

public class HtmlDialog extends Dialog{
	@Override
	public Button createButton() {
		return new HtmlButton();
	}
}
