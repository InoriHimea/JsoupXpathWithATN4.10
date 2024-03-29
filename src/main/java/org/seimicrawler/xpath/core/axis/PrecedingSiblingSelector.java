package org.seimicrawler.xpath.core.axis;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.seimicrawler.xpath.core.AxisSelector;
import org.seimicrawler.xpath.core.XValue;
import org.seimicrawler.xpath.util.CommonUtil;

import java.util.LinkedList;
import java.util.List;

/**
 * the preceding-sibling axis contains all the preceding siblings of the context node; if the context node is
 * an attribute node or namespace node, the preceding-sibling axis is empty
 *
 * @author github.com/zhegexiaohuozi seimimaster@gmail.com
 * @since 2018/3/27.
 */
public class PrecedingSiblingSelector implements AxisSelector {
    /**
     * assign name
     *
     * @return name
     */
    @Override
    public String name() {
        return "preceding-sibling";
    }

    /**
     * @param context
     * @return res
     */
    @Override
    public XValue apply(Elements context) {
        List<Element> total = new LinkedList<>();
        for (Element el : context){
            Node tmp = el.previousSibling();
            while (tmp!=null){
                if (tmp instanceof Element ){
                    total.add((Element) tmp);
                } else if (tmp instanceof TextNode) {
                    Element txt = new Element("text");
                    txt.text(((TextNode) tmp).text());
                    total.add(txt);
                }
                tmp = tmp.previousSibling();
            }
        }
        Elements newContext = new Elements();
        newContext.addAll(total);
        return XValue.create(newContext);
    }
}
