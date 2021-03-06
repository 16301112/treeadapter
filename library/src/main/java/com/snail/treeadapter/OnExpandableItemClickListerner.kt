package com.snail.treeadapter

import android.view.View
import android.widget.AdapterView

/**
 * 时间: 2017/12/5 11:12
 * 作者: 曾繁盛
 * 邮箱: 43068145@qq.com
 * 功能:
 */

interface OnExpandableItemClickListerner<T : Node<T>> {
    fun onExpandableItemClick(node: T, parent: AdapterView<*>, view: View, position: Int)
}
