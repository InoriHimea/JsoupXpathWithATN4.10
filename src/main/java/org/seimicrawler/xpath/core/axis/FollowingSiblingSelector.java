package org.seimicrawler.xpath.core.axis;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.seimicrawler.xpath.core.AxisSelector;
import org.seimicrawler.xpath.core.XValue;

import java.util.LinkedList;
import java.util.List;

/**
 * the following-sibling axis contains all the following siblings of the context node; if the context node is an
 * attribute node or namespace node, the following-sibling axis is empty
 *
 * @author github.com/zhegexiaohuozi seimimaster@gmail.com
 * @since 2018/3/27.
 */
public class FollowingSiblingSelector implements AxisSelector {
    /**
     * assign name
     *
     * @return name
     */
    @Override
    public String name() {
        return "following-sibling";
    }

    /**
     *
     * @param context
     * @return res
     */
    @Override
    public XValue apply(Elements context) {
        List<Element> total = new LinkedList<>();
        for (Element el : context){
            Node tmp = el.nextSibling();
            while (tmp!=null){
                if (tmp instanceof Element ){
                    total.add((Element) tmp);
                } else if (tmp instanceof TextNode) {
                    Element txt = new Element("text");
                    txt.text(((TextNode) tmp).text());
                    total.add(txt);
                }
                tmp = tmp.nextSibling();
            }
        }
        Elements newContext = new Elements();
        newContext.addAll(total);
        return XValue.create(newContext);
    }
}
