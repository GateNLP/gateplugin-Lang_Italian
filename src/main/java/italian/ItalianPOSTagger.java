package italian;

import gate.creole.POSTagger;
import gate.creole.ResourceReference;
import gate.creole.metadata.CreoleParameter;
import gate.creole.metadata.CreoleResource;

@CreoleResource(name = "Italian POS Tagger")
public class ItalianPOSTagger extends POSTagger {

  private static final long serialVersionUID = -8269321728400574645L;

  @Override
  @CreoleParameter(defaultValue = "resources/pos/lexicon_ITA")
  public void setLexiconURL(ResourceReference lexicon) {
    super.setLexiconURL(lexicon);
  }
  
  @Override
  @CreoleParameter(defaultValue = "resources/pos/ruleset")
  public void setRulesURL(ResourceReference rules) {
    super.setRulesURL(rules);
  }
  
  @Override
  @CreoleParameter(defaultValue = "UTF-8")
  public void setEncoding(String encoding) {
    super.setEncoding(encoding);
  }
}
