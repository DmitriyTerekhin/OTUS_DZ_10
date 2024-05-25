
import SwiftUI
import shared

struct NewsItemView: View {
    @State var item: NewsItem
    
    var body: some View {
        GeometryReader { reader in
            NavigationView {
                ScrollView {
                    VStack(alignment: .leading, spacing: 10) {
                        Text(item.title ?? "")
                        Text(item.content ?? "")
                        Button {
                            UIApplication.shared.open(URL(string: item.url ?? "")!, options: [:], completionHandler: nil)
                        } label: {
                            Text("Show more")
                        }
                        Spacer()
                    }.padding(EdgeInsets(top: 0, leading: 10, bottom: 0, trailing: 10))
                }.navigationBarItems(leading:  Color.blue.frame(width: 40, height: 40, alignment: .topLeading))
            }
        }
    }
}

